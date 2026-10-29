/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafdf6c..0xafe028 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afdf6c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
} st_afdf6c_0;


unsigned int sub_afdf6c(long long a0, st_afdf6c_0 **a1, void* a2)
{
    st_afdf6c_0 *v2;  // x0
    st_afdf6c_0 *v3;  // x0
    st_afdf6c_0 *v4;  // x0
    st_afdf6c_0 *v5;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a1 = 0;
    v2 = sub_a6fbc4();
    if (v2)
    {
        if (v2->field_8 == 4)
            *a1 = v2->field_10;
        else
            return 0;
    }
    sub_a32e7c(*(long long *)a2);
    *(unsigned long long *)a2 = 0;
    v3 = sub_a6fbc4(a0, "engine");
    if (v3)
    {
        if (v3->field_8 == 4)
        {
            v4 = sub_a33a3c(v3->field_10);
            *(st_afdf6c_0 **)a2 = v4;
            if (!v4)
                return v4;
            v5 = (st_afdf6c_0 *)(unsigned int)sub_a32d54();
            sub_a330d4(*(long long *)a2);
            if (!v5)
            {
                *(unsigned long long *)a2 = 0;
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    return 1;
}
