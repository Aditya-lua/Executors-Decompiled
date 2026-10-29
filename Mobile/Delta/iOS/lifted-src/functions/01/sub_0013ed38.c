/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13ed38..0x13edbc (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13ed38_0 {
    char padding_0[84];
    unsigned int field_54;
} st_13ed38_0;

typedef struct st_13ed38_1 {
    char field_0;
} st_13ed38_1;


st_13ed38_0 ** sub_13ed38(st_13ed38_0 **iter, st_13ed38_0 **a1, st_13ed38_0 **node, st_13ed38_0 **a3, st_13ed38_0 **iter1)
{
    unsigned long long v5;  // x30
    st_13ed38_0 *v6;  // x8
    st_13ed38_0 *v7;  // x9
    unsigned int v8;  // w10
    unsigned int v9;  // w11
    st_13ed38_1 **v0;  // [bp-0x20], Other Possible Types: char
    st_13ed38_1 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (iter == a1)
        return iter;
    v2 = &v4;
    v3 = v5;
    do
    {
        if (node == a3)
        {
            v1 = &v0;
            v0 = &v1;
            iter = sub_13bbc(iter1, iter, (long long)(a1 - iter) >> 3);
            break;
        }
        v6 = *node;
        v7 = *iter;
        v8 = *node->field_54;
        v9 = *iter->field_54;
        if ((int)v8 >= (int)v9)
            v6 = v7;
        node = &node[(int)v9 > (int)v8];
        iter = &iter[(int)v8 >= (int)v9];
        *iter1 = v6;
        iter1 += 1;
    } while (iter != a1);
    return iter;
}
