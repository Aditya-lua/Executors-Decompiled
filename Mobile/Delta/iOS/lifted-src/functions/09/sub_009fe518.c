/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fe518..0x9fe628 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9fe518(void* a0, long long a1, void* a2)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x19
    unsigned long v4;  // x22
    long long v5;  // x0
    unsigned long v6;  // x20
    unsigned int v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)a2 = 0;
    v2 = sub_9e4958();
    if (!v2)
        return 0;
    v3 = v2;
    v4 = (long long)a0[16];
    if (!v4)
    {
        if (!(long long)a0[8])
            goto LABEL_9fe604;
        if ((int)a0[104])
        {
            v6 = sub_9e46a8(a1) == (int)a0[104];
        }
        else
        {
            v7 = sub_9e46a8();
            if ((int)v7 <= (int)sub_9e46a8(a1))
                goto LABEL_9fe604;
            v6 = (int)sub_9e46a8(a1) > 1;
        }
    }
    else if (sub_9fec10(a0) && (int)a0[104])
    {
        v5 = sub_9e4624();
        if (sub_9ea668(v3, v5, (int)a0[104]))
        {
            if ((int)sub_9e5528(v3, (long long)a0[16]) < 0)
            {
                v4 = v3;
                goto LABEL_9fe590;
            }
            else
            {
                goto LABEL_9fe590;
            }
        }
LABEL_9fe604:
        v6 = 0;
    }
    else
    {
LABEL_9fe590:
        v6 = sub_a60b8c(v4, a1, a2) != 0;
    }
    sub_9e48d4(v3);
    return v6;
}
