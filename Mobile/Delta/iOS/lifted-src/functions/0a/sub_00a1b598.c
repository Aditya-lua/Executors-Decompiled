/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b598..0xa1b690 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a1b598(void* a0, void* a1, void* a2, void* a3)
{
    void* v2;  // x8
    unsigned int v3;  // w9
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(long long *)a0;
    if ((long long)v2[160])
    {
        if (v2 == *(long long *)a1)
        {
            v3 = (int)a0[32];
            if (v3)
            {
                if ((!(int)a1[8] || v3 == (int)a1[8]) && v2 == *(long long *)a2 && (!(int)a2[8] || v3 == (int)a2[8]) && v2 == *(long long *)a3 && (!(int)a3[8] || v3 == (int)a3[8]))
                    goto LABEL_a1b688;
            }
            else
            {
                if (v2 == *(long long *)a2 && v2 == *(long long *)a3)
                {
LABEL_a1b688:
                    goto *((void *)((long long)v2[160]));
                }
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 949, "EC_POINT_add");
        v4 = 101;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 944, "EC_POINT_add");
        v4 = 786689;
    }
    sub_a36abc(16, v4, 0);
    return 0;
}
