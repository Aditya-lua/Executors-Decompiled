/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70df8..0xa70ed8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a70df8(void* a0, unsigned long a1, unsigned long a2)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(long long)a0[16])
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 236, "general_get_uint");
        v2 = 786690;
    }
    else if ((int)a0[8] == 2)
    {
LABEL_a70e80:
    }
    else if ((int)a0[8] == 1)
    {
        if (*(char *)((long long)a0[16] + (long long)a0[24] - 1) >= 0)
            goto LABEL_a70e80;
        sub_a368c8();
        sub_a369bc("crypto/params.c", 184, "unsigned_from_signed");
        v2 = 125;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 243, "general_get_uint");
        v2 = 124;
    }
    sub_a36abc(15, v2, 0);
    return 0;
}
