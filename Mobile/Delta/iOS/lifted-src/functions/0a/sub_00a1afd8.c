/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1afd8..0xa1b0a8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a1afd8(void* a0, void* a1, void* a2)
{
    void* v2;  // x8
    unsigned int v3;  // w9
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(long long *)a0;
    if ((long long)v2[200])
    {
        if (v2 == *(long long *)a1)
        {
            v3 = (int)a0[32];
            if (v3)
            {
                if ((!(int)a1[8] || v3 == (int)a1[8]) && v2 == *(long long *)a2 && (!(int)a2[8] || v3 == (int)a2[8]))
                    goto LABEL_a1b0a0;
            }
            else
            {
                if (v2 == *(long long *)a2)
                {
LABEL_a1b0a0:
                    goto *((void *)((long long)v2[200]));
                }
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 0x400, "EC_POINT_cmp");
        v4 = 101;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 0x3fc, "EC_POINT_cmp");
        v4 = 786689;
    }
    sub_a36abc(16, v4, 0);
    return 0xffffffff;
}
