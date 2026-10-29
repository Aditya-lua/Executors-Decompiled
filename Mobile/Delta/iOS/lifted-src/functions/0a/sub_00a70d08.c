/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70d08..0xa70df8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a70d08(void* a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x19
    unsigned int v3;  // w0
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    if (!(long long)a0[16])
    {
LABEL_a70d88:
        v3 = 1;
    }
    else if ((int)a0[8] == 2)
    {
        if (*(char *)(a1 + v2 - 1) >= 0)
        {
            v3 = sub_a71d50();
            if (!v3)
            {
                *(unsigned long long *)&a0[32] = v2;
                return v3;
            }
LABEL_a70d84:
            v2 = (long long)a0[24];
            goto LABEL_a70d88;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/params.c", 184, "unsigned_from_signed");
            v4 = 125;
            goto LABEL_a70ddc;
        }
        goto LABEL_a70ddc;
    }
    else if ((int)a0[8] == 1)
    {
        v3 = sub_a71d50();
        if (v3)
            goto LABEL_a70d84;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 226, "general_set_int");
        v4 = 124;
LABEL_a70ddc:
        sub_a36abc(15, v4, 0);
        v3 = 0;
    }
    *(unsigned long long *)&a0[32] = v2;
    return v3;
}
