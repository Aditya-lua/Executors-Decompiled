/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc7992c..0xc799e4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c7992c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_c7992c_0;

extern char g_efd030;

unsigned long long sub_c7992c(st_c7992c_0 *a0, unsigned long a1, unsigned long a2, long long *a3)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_b72214(&v0);
    if (v0 == 0x8000000000000000)
    {
        v6 = sub_c5cd20(a0, v1, *a3);
        *(char *)v1 = 0;
        if (!v2)
            return v6;
    }
    else
    {
        a0->field_8 = &g_efd030;
        a0->field_0 = 1;
        if (!v0)
            return v5;
    }
    return _free();
}
