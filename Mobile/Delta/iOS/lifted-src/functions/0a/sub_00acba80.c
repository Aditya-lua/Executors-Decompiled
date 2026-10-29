/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacba80..0xacbbc4 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_acba80_0 {
    char padding_0[32];
    unsigned int field_20;
    unsigned int field_24;
    char field_28;
    char padding_29[55];
    unsigned int field_60;
    unsigned int field_64;
    unsigned int field_68;
} st_acba80_0;

extern unsigned long long g_ac9000;
extern unsigned long long g_ac9800;
extern unsigned int g_f0d568;

void sub_acba80(unsigned long a0, st_acba80_0 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long *v19;  // x8
    unsigned long v20;  // x9
    unsigned long v21;  // x8
    unsigned long long *v22;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned int *v16;  // x21
    unsigned long v17;  // x8
    unsigned long v18;  // x9
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = &a1->field_28;
    v17 = a1->field_68;
    *((char *)v16 + v17) = 128;
    v18 = v17 + 1;
    if ((unsigned int)v17 >= 56)
    {
        _bzero((char *)v16 + v18, 63 - v17);
        if (!(g_f0d568 & 0x200))
            v19 = &g_ac9800;
        else
            v19 = &g_ac9000;
        v19();
    }
    else
    {
        _bzero((char *)v16 + v18, 56 - v18);
        v20 = a1->field_20;
        v21 = a1->field_24;
        a1->field_60 = (((((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a1->field_64 = (((((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        if (!(g_f0d568 & 0x200))
            v22 = &g_ac9800;
        else
            v22 = &g_ac9000;
        v22();
    }
}
