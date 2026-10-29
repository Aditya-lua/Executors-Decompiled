/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9acc..0x3c9bbc (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9acc_0 {
    char field_0;
} st_3c9acc_0;

typedef struct st_3c9acc_1 {
    unsigned long long field_0;
} st_3c9acc_1;

extern st_3c9acc_1 *g_f0b120;

char * sub_3c9acc(long long a0, unsigned long long a1, char *a2)
{
    st_3c9acc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3c9acc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(a1 >> 7 & 1))
    {
LABEL_3c9b18:
        if (a1 >> 6 & 1)
        {
            if (!sub_3d2248(a0))
            {
                a2[1] = sub_3d706c(a0);
                goto LABEL_3c9b34;
            }
        }
        else
        {
LABEL_3c9b34:
            if (a1 >> 5 & 1)
            {
                if (!sub_3d2248(a0))
                {
                    a2[2] = sub_3d706c(a0);
                    goto LABEL_3c9b50;
                }
            }
            else
            {
LABEL_3c9b50:
                if (!(a1 >> 4 & 1))
                    return a2;
                if (!sub_3d2248(a0))
                {
                    a2[3] = sub_3d706c(a0);
                    return a2;
                }
            }
        }
    }
    else if (!sub_3d2248(a0))
    {
        *a2 = sub_3d706c(a0);
        goto LABEL_3c9b18;
    }
    g_f0b120();
}
