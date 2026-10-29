/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc01a9c..0xc01b88 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c01a9c_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_c01a9c_0;


unsigned long long sub_c01a9c(st_c01a9c_0 **a0, long long *a1)
{
    unsigned long long *v2;  // x19
    unsigned long long v3;  // x0
    unsigned long v4;  // x8
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &*a0->field_0;
    v3 = sub_c01b88(v2);
    if ((unsigned int)v3)
    {
        return v3;
    }
    else if (*v2 == 10)
    {
        v4 = v2[4];
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!/* unsupported instruction */)
        {
            /* unsupported instruction */;
            v5 = v4;
            if (!(/* unsupported instruction */ ^ 1))
                goto LABEL_c01af0;
        }
        else
        {
            /* unsupported instruction */;
        }
        v5 = v4;
        sub_c7573c(v4 + 8);
LABEL_c01af0:
        sub_c093f0(v5 + 40, *a1);
        while (1)
        {
            /* unsupported instruction */;
            if (/* unsupported instruction */ != 1)
            {
                /* unsupported instruction */;
                sub_c75418(v4 + 8);
                return v3;
            }
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!(/* unsupported instruction */ ^ 1))
                return v3;
        }
    }
    else
    {
        return v3;
    }
}
