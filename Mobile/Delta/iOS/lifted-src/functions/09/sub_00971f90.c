/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971f90..0x9720a0 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971f90_0 {
    char field_0;
    char padding_1[3];
    char field_4;
    char field_5;
    char field_6;
    char padding_7[1];
    struct st_971f90_1 *field_8;
    char field_10;
    char padding_11[55];
    unsigned long long field_48;
} st_971f90_0;

typedef struct st_971f90_1 {
    char field_0;
} st_971f90_1;


st_971f90_0 * sub_971f90(st_971f90_0 *a0, char a1, long long a2)
{
    char v2;  // w8
    unsigned long long v3;  // x10
    char v4;  // w9
    char v5;  // x11
    unsigned long long v6;  // x12
    char v7;  // x9
    st_971f90_0 *v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_4)
        return a0;
    v2 = a0->field_10;
    a0->field_10 = 0;
    v3 = a0->field_48;
    v4 = a0->field_5;
    if (v4)
    {
        v5 = v4 - 1;
        v6 = v3;
        goto LABEL_971fd0;
    }
    else
    {
        if (v3)
        {
            v6 = v3 - 1;
            v5 = 7;
LABEL_971fd0:
            if (((char)(*(char *)&a0->field_8[v6]) >> (v5 & 31) & 1) == a1)
                goto LABEL_971fe8;
        }
        else if (a1 == 0xffffffff)
        {
LABEL_971fe8:
            if (a1 || a0->field_6 != 1)
            {
                if (v3)
                {
                    if (!v4)
                    {
                        a0->field_48 = v3 - 1;
                        v7 = 7;
                        goto LABEL_972018;
                    }
LABEL_972014:
                    v7 = v4 - 1;
LABEL_972018:
                    a0->field_5 = v7;
                    if (!v2)
                    {
                        sub_97228c(a0);
                        a2 = a2;
                    }
                    v8 = sub_9721c8(a0, a2);
                    if (!a0->field_5 && !a0->field_48)
                    {
                        a0->field_6 = 2;
                        if (a0->field_0 & 1)
                            return sub_9721c8();
                        return v8;
                    }
                    a0->field_6 = 2;
                    return v8;
                }
                else if (!(!v4))
                {
                    goto LABEL_972014;
                }
            }
        }
        a0->field_4 = 1;
        return a0;
    }
}
