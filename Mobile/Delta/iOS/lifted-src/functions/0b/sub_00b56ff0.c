/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb56ff0..0xb57118 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b56ff0_1 {
    char padding_0[32];
    char field_20;
    char padding_21[39];
    unsigned long long field_48;
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[59];
    struct st_b56ff0_2 *field_a8;
} st_b56ff0_1;

typedef struct st_b56ff0_0 {
    unsigned long long field_0;
} st_b56ff0_0;

typedef struct st_b56ff0_2 {
    struct st_b56ff0_0 *field_0;
} st_b56ff0_2;


unsigned long long sub_b56ff0(st_b56ff0_1 *ptr, unsigned long long a1, unsigned long a2, unsigned long long a3, long long a4, unsigned long a5, unsigned int a6)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    *(unsigned int *)&ptr->padding_6d[0x33] = 0;
    *(unsigned long long *)&ptr->padding_58[8] = 0;
    v2 = ptr->field_6c;
    ptr->field_6c = (char)v2 & 253 | (char)(__ROL__(a6, 1)) & 2 & 3;
    if (a3)
    {
        if (!sub_b5c520(ptr, a3, a4))
            return 0;
    }
    else
    {
        if (v2 >> 2 & 1)
            _memcpy(&ptr->field_20, ptr, ptr->field_50);
    }
    if (a1)
    {
        if (ptr->field_48 == a2)
            (*(long long *)ptr->field_a8)();
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_des.c", 94, "des_init");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
