/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb462ac..0xb4643c (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b462ac_1 {
    unsigned long long field_0;
} st_b462ac_1;

typedef struct st_b462ac_0 {
    char padding_0[48];
    struct st_b462ac_1 *field_30;
    char padding_38[8];
    struct st_b462ac_1 *field_40;
    char padding_48[24];
    struct st_b462ac_1 *field_60;
    char padding_68[16];
    unsigned int field_78;
} st_b462ac_0;


unsigned long long * sub_b462ac(st_b462ac_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    long long v4;  // x1
    unsigned int v0;  // [bp-0x4c]
    st_b462ac_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a0;
    if (a0->field_30)
    {
        if (!a0->field_60)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 208, "get_entropy");
            v4 = 0xbb;
        }
        else if (!sub_b46cc4())
        {
            return 0;
        }
        else if (a0->field_78 > v0)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 218, "get_entropy");
            v4 = 194;
        }
        else
        {
            if (a0->field_30 && a0->field_40)
                a0->field_40();
            a0->field_60();
        }
        sub_a36abc(57, v4, 0);
        return 0;
    }
}
