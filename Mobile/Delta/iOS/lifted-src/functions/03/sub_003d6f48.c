/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d6f48..0x3d706c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d6f48_0 {
    char field_0;
} st_3d6f48_0;


unsigned long long sub_3d6f48(long long a0, char *a1, unsigned long long a2)
{
    char *node;  // x21
    unsigned long long v5;  // x22
    char *iter;  // x8
    char *iter1;  // x10
    unsigned long long j;  // x11
    unsigned long long v17;  // x11
    unsigned int v19;  // w9
    unsigned long long v21;  // 4119
    unsigned long long v6;  // w25
    unsigned long long v7;  // x0
    unsigned long v8;  // x24
    unsigned long long i;  // w25
    unsigned long long v10;  // w25
    unsigned long long v11;  // x24
    char v12;  // x0
    unsigned long long v13;  // x9
    st_3d6f48_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3d6f48_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2 < 1)
        return 1;
    node = a1;
    v5 = 0;
    v6 = a2;
    do
    {
        v7 = sub_3d706c(a0);
        if ((unsigned int)v7 != 128)
        {
            if (v7 >> 7 & 1)
            {
                v11 = 0x101 - v7;
                if (v6 < (unsigned int)v11)
                    return 0;
                v12 = sub_3d706c(a0);
                v13 = v11 & 254;
                iter = &node[4 * v13];
                iter1 = node + 4;
                j = v13;
                do
                {
                    v17 = j;
                    *(iter1 - 4) = v12;
                    *iter1 = v12;
                    iter1 += 8;
                    j = v17 - 2;
                } while (j);
                if (v13 != v11)
                {
                    v19 = (unsigned int)v13 + (unsigned int)v7 - 0x101;
                    do
                    {
                        *iter = v12;
                        iter += 4;
                        v21 = arm64g_calculate_condition(49, v19, 1, 0);
                        v19 += 1;
                    } while (v21 & 1);
                }
                v5 += v11;
                node = iter;
            }
            else if (v6 > (unsigned int)v7)
            {
                v8 = (unsigned int)v7 + 1;
                i = (unsigned int)v8;
                do
                {
                    v10 = i;
                    *node = sub_3d706c(a0);
                    node += 4;
                    i = v10 - 1;
                } while (i);
                v5 += v8;
            }
            else
            {
                return 0;
            }
        }
    } while ((v6 = (unsigned int)(a2 - v5), v6 >= 1));
    return 1;
}
