/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0b334..0xb0b464 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0b334_1 {
    char padding_0[32];
    char field_20;
    char padding_21[31];
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[59];
    struct st_b0b334_2 *field_a8;
} st_b0b334_1;

typedef struct st_b0b334_0 {
    unsigned long long field_0;
} st_b0b334_0;

typedef struct st_b0b334_2 {
    struct st_b0b334_0 *field_0;
} st_b0b334_2;


unsigned long long sub_b0b334(st_b0b334_1 *ptr, unsigned long long a1, unsigned long a2, unsigned long long a3, long long a4, long long a5, unsigned int a6)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // x8
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    *(unsigned int *)&ptr->padding_6d[0x33] = 0;
    *(unsigned long long *)&ptr->padding_58[8] = 0;
    v3 = ptr->field_6c;
    ptr->field_6c = (char)v3 & 253 | (char)(__ROL__(a6, 1)) & 2 & 3;
    if (a3)
    {
        v4 = sub_b5c520(ptr, a3, a4);
        if (!(unsigned int)v4)
            return v4;
    }
    else if (v3 >> 2 & 1 && 2 >= ptr->field_40 - 2)
    {
        _memcpy(&ptr->field_20, ptr, ptr->field_50);
    }
    if (!a1)
    {
        return sub_b5b654(ptr, a5) != 0;
    }
    else if (ptr->field_48 == a2)
    {
        (*(long long *)ptr->field_a8)();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_tdes_common.c", 101, "tdes_init");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
