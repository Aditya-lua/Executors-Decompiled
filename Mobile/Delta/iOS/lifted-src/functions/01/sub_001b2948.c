/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2948..0x1b2aa8 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2948_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1b2948_1;

typedef struct st_1b2948_0 {
    char field_0;
} st_1b2948_0;


unsigned long long sub_1b2948(st_1b2948_1 *a0, void* a1)
{
    char *v4;  // x8
    unsigned long v5;  // x9
    unsigned long v6;  // x22
    unsigned long long v7;  // w21
    unsigned long long v8;  // x0
    unsigned long long v9;  // x8
    unsigned int v10;  // w9
    st_1b2948_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1b2948_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a1[8] != (long long)a1[24])
    {
        v4 = (long long)a1[16];
        if (v4 != (long long)a1[24])
        {
            if (v4 == (long long)a1[8] && (v5 = (int)a1[88], !(v5 >> 7 & 1)))
            {
                if (!(v5 >> 2 & 1))
                {
                    if (*v4 == 95)
                        goto LABEL_1b2a24;
                    goto LABEL_1b29b0;
                }
                goto LABEL_1b2a38;
            }
            v6 = *v4;
            if (*(v4 - 1) == 95)
            {
                v7 = 1;
                if ((unsigned int)v6 == 95)
                    goto LABEL_1b2a6c;
                goto LABEL_1b29e8;
            }
            v7 = (unsigned int)sub_1c672c(a0 + 1);
            if ((unsigned int)v6 != 95)
            {
LABEL_1b29e8:
                v8 = v7 != (unsigned int)sub_1c672c(a0 + 1, v6, 0x500);
                if ((char)a0[2].field_8 != (unsigned int)v8)
                    goto LABEL_1b2a84;
            }
            else
            {
LABEL_1b2a6c:
                v8 = v7 != 1;
                if ((char)a0[2].field_8 != (unsigned int)v8)
                    goto LABEL_1b2a84;
            }
        }
        else
        {
            if ((char)((char)a1[88]) >> 3 & 1)
                goto LABEL_1b2a38;
            if (*(v4 - 1) != 95)
            {
LABEL_1b29b0:
                v8 = sub_1c672c(a0 + 1);
                if ((char)a0[2].field_8 != (unsigned int)v8)
                    goto LABEL_1b2a84;
            }
            else
            {
LABEL_1b2a24:
                v8 = 1;
                if ((char)a0[2].field_8 != 1)
                    goto LABEL_1b2a84;
            }
        }
LABEL_1b2a48:
        v9 = 0;
        v10 = 0xfffffc1f;
    }
    else
    {
LABEL_1b2a38:
        v8 = 0;
        if (!(char)a0[2].field_8)
            goto LABEL_1b2a48;
LABEL_1b2a84:
        v9 = a0->field_8;
        v10 = 0xfffffc1e;
    }
    *(unsigned int *)a1 = v10;
    *(unsigned long long *)&a1[80] = v9;
    return v8;
}
