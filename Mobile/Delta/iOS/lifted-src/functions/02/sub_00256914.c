/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x256914..0x256a2c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_256914_1 {
    struct st_256914_2 *field_0;
} st_256914_1;

typedef struct st_256914_2 {
    struct st_256914_1 *field_0;
} st_256914_2;

typedef struct st_256914_0 {
    char field_0;
} st_256914_0;


char * sub_256914(long long a0, long long a1, long long a2)
{
    char *v8;  // x22
    st_256914_0 **v9;  // x0
    char *v18;  // x10
    char *v19;  // x12
    char *v20;  // x11
    char *v21;  // w13
    char *v10;  // w8
    char *v11;  // x11
    char *v12;  // x10
    char *v13;  // x11
    char *v14;  // x10
    char *v17;  // w11
    st_256914_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_256914_0 *v1;  // [bp-0x78]
    st_256914_2 **v2;  // [bp-0x70]
    st_256914_2 **v3;  // [bp-0x68]
    char *v4;  // [bp-0x60]
    st_256914_0 **v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (a0 == a1)
        return 1;
    do
    {
        v8 = sub_a0c8(a2);
        v9 = sub_a0c8(a0);
        v2 = &v3;
        v3 = &v2;
        v10 = (char *)*(char *)v9;
        if (v10)
        {
            v11 = 0;
            v12 = 1;
            do
            {
                v13 = v11;
                v14 = v12;
                v12 = v14 + 1;
                v11 = v13 - 1;
            } while (*(char *)(v9 + v14));
            while (1)
            {
                v17 = (char *)*v8;
                if (!v17)
                    break;
                v18 = v8;
                v8 += 1;
                if (v17 != v10)
                    continue;
                v4 = &v5;
                v5 = &v4;
                v19 = 1;
                v20 = v13;
                while (1)
                {
                    if (!v20)
                        goto LABEL_2569f4;
                    v21 = (char *)*(char *)(v18 + v19);
                    if (v21 != *(char *)(v9 + v19))
                        break;
                    v19 += 1;
                    v20 += 1;
                    if (!v21)
                        goto LABEL_2569f4;
                }
            }
        }
        else
        {
            v18 = v8;
LABEL_2569f4:
            if (v18)
                return 0;
        }
    } while ((a0 += 24, a0 != a1));
    return 1;
}
