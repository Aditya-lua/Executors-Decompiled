/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8eda84..0x8edd9c (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8eda84_1 {
    char padding_0[21];
    struct st_8eda84_1 *field_15;
    char field_16;
    struct st_8eda84_1 *field_17;
} st_8eda84_1;

typedef struct st_8eda84_0 {
    char field_0;
} st_8eda84_0;

extern unsigned long long g_e82ed0;

unsigned int sub_8eda84(uint128_t *a0, unsigned long long a1, st_8eda84_1 **a2)
{
    st_8eda84_1 *ptr;  // x0
    st_8eda84_1 *v14;  // x0
    st_8eda84_1 *v16;  // w8
    st_8eda84_0 **v0;  // [bp-0xe8], Other Possible Types: char
    st_8eda84_0 *v1;  // [bp-0xe0]
    st_8eda84_1 **v2;  // [bp-0xd8]
    uint128_t v3;  // [bp-0xd0]
    unsigned long long v4;  // [bp-0xc0]
    st_8eda84_1 *v5;  // [bp-0xb1]
    st_8eda84_0 **v6;  // [bp-0xb0], Other Possible Types: char
    st_8eda84_0 *v7;  // [bp-0xa8]
    st_8eda84_1 *v8;  // [bp-0x88]
    st_8eda84_0 **v9;  // [bp-0x80], Other Possible Types: char
    st_8eda84_0 *v10;  // [bp-0x78]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v1 = &v0;
    v0 = &v1;
    v5 = (st_8eda84_1 *)1;
    v2 = &v5;
    v3 = *a0;
    v4 = a1;
    v7 = &v6;
    v6 = &v7;
    if (*a2 && !(ptr = _opendir(*a2), !ptr))
    {
        v8 = ptr;
        while (1)
        {
            v14 = _readdir(ptr);
            if (!v14)
                break;
            if ((v14->padding_0)[1] != 46)
            {
LABEL_8edb68:
                v10 = &v9;
                v9 = &v10;
                (g_e82ed0 - 0xb7923e00)();
            }
            switch ((v14->padding_0)[1 + 1])
            {
            case 0:
                continue;
            case 46:
                if ((v14->padding_0)[1 + 2])
                    goto LABEL_8edb68;
                continue;
            default:
                goto LABEL_8edb68;
            }
        }
        sub_8ed92c(&v8);
        v16 = (st_8eda84_1 *)1;
    }
    else
    {
        v16 = (st_8eda84_1 *)0;
    }
    return v16 & (unsigned int)v5;
}
