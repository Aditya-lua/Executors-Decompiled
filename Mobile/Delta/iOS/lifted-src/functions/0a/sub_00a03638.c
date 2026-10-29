/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03638..0xa03744 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03638_0 {
    struct st_a03638_0 *field_0;
    struct st_a03638_0 *field_8;
} st_a03638_0;


unsigned int sub_a03638(long long *a0, st_a03638_0 *a1)
{
    st_a03638_0 *v4;  // x20
    char v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a1)
    {
        if (!a1->field_0)
        {
            v4 = sub_9ebce0();
            if (v4 && sub_c68910(&v0, v4, 0))
                goto LABEL_a03688;
            sub_9ebcf4(v4);
        }
        else if (sub_c68800(&v0))
        {
            goto LABEL_a03684;
        }
    }
    else
    {
        if (sub_a6ea2c(&v0))
        {
LABEL_a03684:
            v4 = 0;
LABEL_a03688:
            if (sub_a674bc(&v0, *a0, a0[1]) && sub_c68eb8(&v0, &v1) && sub_a6eaf8(&v0))
            {
                if (!a1)
                    return v1;
                if (a1->field_0)
                {
                    a1->field_0 = (char *)a1->field_0 + v1;
                }
                else
                {
                    a1->field_0 = v4->field_8;
                    v4->field_8 = 0;
                    sub_9ebcf4(v4);
                }
                return v1;
            }
            sub_9ebcf4(v4);
            sub_a6ed4c(&v0);
            return 0xffffffff;
        }
    }
    return 0xffffffff;
}
