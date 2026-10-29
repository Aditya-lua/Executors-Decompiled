/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3304..0xac363c (824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3304_2 {
    char padding_0[128];
    struct st_ac3304_3 *field_80;
    char padding_88[24];
    struct st_ac3304_4 *field_a0;
    struct st_ac3304_0 *field_a8;
} st_ac3304_2;

typedef struct st_ac3304_4 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[32];
    unsigned int field_34;
} st_ac3304_4;

typedef struct st_ac3304_0 {
    char padding_0[72];
    struct st_ac3304_1 *field_48;
} st_ac3304_0;

typedef struct st_ac3304_1 {
    unsigned long long field_0;
} st_ac3304_1;

typedef struct st_ac3304_3 {
    char field_0;
} st_ac3304_3;

extern char g_10002b0;

char * sub_ac3304(st_ac3304_2 **a0, char *a1, long long a2, long long a3, long long a4, long long a5, unsigned long a6, unsigned long a7)
{
    char *v8;  // x0
    st_ac3304_2 *v9;  // x25
    unsigned long v10;  // x8
    st_ac3304_0 *v0;  // [bp-0x510]
    char v1;  // [bp-0x500]
    unsigned long long v2;  // [bp-0x4f8]
    unsigned long long v3;  // [bp-0x4f0]
    char v4;  // [bp-0x4e1]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = sub_ac31bc(a1, a2, a3, a4, a5, &v4, &v1);
    if (v8)
    {
        v9 = *a0;
        if (!v9->field_80)
        {
            sub_a368c8();
            sub_a369bc("crypto/slh_dsa/slh_dsa.c", 177, "slh_verify_internal");
            sub_a36abc(57, 128, 0);
        }
        else if (v9->field_a0->field_34 == a7)
        {
            v10 = v9->field_a0->field_10;
            if (a7 >= v10)
            {
                v2 = a6 + v10;
                v3 = a7 - v10;
                v0 = v9->field_a8;
                v9->field_a8->field_48();
            }
        }
        if (v8 != a1)
        {
            if (v8 != &v4)
                sub_a6c4e8();
            else
                sub_a66ec0(&v4, 0x400);
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
