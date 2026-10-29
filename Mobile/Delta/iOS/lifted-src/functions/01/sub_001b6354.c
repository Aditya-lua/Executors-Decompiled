/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6354..0x1b6428 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6354_1 {
    char padding_0[28];
    unsigned int field_1c;
} st_1b6354_1;

typedef struct st_1b6354_0 {
    char field_0;
} st_1b6354_0;


char * sub_1b6354(st_1b6354_1 *a0, char *a1, char *a2)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w1
    char *v6;  // x19
    unsigned int v7;  // w10
    st_1b6354_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b6354_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = *a1;
    v5 = v4 - 48;
    if (v4 == 48)
    {
        sub_1bbad0();
        return a1 + 1;
    }
    if (8 < v4 - 49)
        return a1;
    v6 = a1 + 1;
    if (v6 != a2)
    {
        while (1)
        {
            v7 = *v6;
            if (9 >= v7 - 48)
            {
                if (429496729 <= v5)
                    break;
                v6 += 1;
                v5 = v7 + 10 * v5 - 48;
                if (v6 == a2)
                {
                    v6 = a2;
                    goto LABEL_1b63fc;
                }
            }
            else
            {
LABEL_1b63fc:
                if (v5)
                    goto LABEL_1b6400;
                break;
            }
        }
    }
    else
    {
LABEL_1b6400:
        if (a0->field_1c >= v5)
        {
            sub_1bdae0();
            return v6;
        }
    }
    sub_1b1564();
}
