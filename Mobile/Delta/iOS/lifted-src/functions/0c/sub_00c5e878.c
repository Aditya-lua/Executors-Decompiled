/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e878..0xc5e8e4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5e878_0 {
    char padding_0[8];
    struct st_c5e878_1 *field_8;
} st_c5e878_0;

typedef struct st_c5e878_1 {
    unsigned long long field_0;
} st_c5e878_1;


void sub_c5e878(st_c5e878_0 *a0)
{
    unsigned long long v0;  // x1
    unsigned long long v1;  // x9

    v0 = *(long long *)a0->field_8;
    /* unsupported instruction */;
    while (1)
    {
        if (!(v0 >> 1 & 1))
        {
            /* unsupported instruction */;
            v1 = /* unsupported instruction */;
            /* unsupported instruction */;
            if (v1 != v0)
                goto LABEL_c5e8cc;
            goto LABEL_c5e8a0;
        }
        else
        {
            /* unsupported instruction */;
            v1 = /* unsupported instruction */;
            /* unsupported instruction */;
            if (v1 == v0)
            {
LABEL_c5e8a0:
                v0 = v1;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    return;
            }
            else
            {
LABEL_c5e8cc:
                v0 = v1;
                /* unsupported instruction */;
            }
        }
    }
}
