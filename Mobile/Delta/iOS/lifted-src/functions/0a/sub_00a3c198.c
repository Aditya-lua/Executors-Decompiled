/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c198..0xa3c290 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3c198_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_a3c198_0;


unsigned long long sub_a3c198(unsigned int a0, unsigned long a1, void* a2)
{
    unsigned long long v2;  // x0
    st_a3c198_0 *v3;  // x22
    unsigned long long v4;  // x0
    long long v5;  // x1
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3bbe8();
    if ((int)v2 < 1)
    {
        return v2;
    }
    else if ((int)a2[8] == 2)
    {
        switch (a0)
        {
        case 4:
            v6 = (long long)a2[32];
            if (!v6)
                return v6;
            v7 = sub_a2d030(sub_a60658(_atoi(v6)));
            *(unsigned long long *)&a2[32] = v7;
            if (v7)
            {
                *(unsigned int *)&a2[28] = 0;
            }
            else
            {
                sub_a368c8();
                v5 = 1049;
                break;
            }
        case 1:
            v3 = a2 + 28;
            v4 = sub_a2d030(sub_a60658((int)a2[28]));
            *(unsigned long long *)&(&v3->field_0)[1] = v4;
            if (!v4)
            {
                sub_a368c8();
                v5 = 1038;
                break;
            }
            else
            {
                v3->field_0 = 0;
            }
        }
        sub_a369bc("crypto/evp/ctrl_params_translate.c", v5, "fix_dh_nid5114");
        sub_a36abc(6, 222, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
