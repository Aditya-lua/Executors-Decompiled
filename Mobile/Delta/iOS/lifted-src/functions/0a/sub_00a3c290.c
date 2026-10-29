/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c290..0xa3c340 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a3c290(long long a0, unsigned long a1, void* a2)
{
    long long v2;  // w0
    unsigned long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a3bbe8();
    if (v2 < 1)
    {
        return v2;
    }
    else if ((int)a2[8] != 2)
    {
LABEL_a3c32c:
        return 0;
    }
    else if (a0 == 1)
    {
        v3 = sub_a2d030(sub_a60658((int)a2[28]));
        *(unsigned long *)&a2[32] = v3;
        if (v3)
        {
            *(unsigned int *)&a2[28] = 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/ctrl_params_translate.c", 1012, "fix_dh_nid");
            sub_a36abc(6, 222, 0);
            goto LABEL_a3c32c;
        }
    }
}
