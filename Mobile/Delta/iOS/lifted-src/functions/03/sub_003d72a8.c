/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d72a8..0x3d743c (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d72a8_1 {
    struct st_3d72a8_0 *field_0;
} st_3d72a8_1;

typedef struct st_3d72a8_0 {
    char field_0;
} st_3d72a8_0;


double sub_3d72a8(uint128_t *a0)
{
    unsigned int v6;  // w0
    unsigned int v7;  // w20
    unsigned int v8;  // w0
    long long v9;  // x21
    unsigned long long v11;  // w21
    unsigned long long v12;  // w21
    unsigned int v13;  // w8
    uint128_t v14;  // q0
    st_3d72a8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_3d72a8_0 *v1;  // [bp-0x58]
    st_3d72a8_0 *v2;  // [bp-0x50], Other Possible Types: st_3d72a8_1 **
    st_3d72a8_0 **v3;  // [bp-0x48], Other Possible Types: st_3d72a8_1 **, char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    sub_3d706c();
    v6 = sub_3d706c(a0);
    if (v6 > 1)
    {
LABEL_3d72e8:
    }
    else
    {
        v7 = v6;
        v8 = sub_3d706c(a0);
        if (v7 == 1)
        {
            if ((v8 & 0xfffffff7) == 1)
            {
                v9 = 4;
                sub_3d44fc(a0, 4);
                if (32 >= sub_3d706c(a0) && 1 << ((char)sub_3d706c(a0) & 63) & 0x101018100)
                    goto LABEL_3d738c;
                goto LABEL_3d72ec;
            }
            goto LABEL_3d72e8;
        }
        else
        {
            if ((v8 & 246) != 2)
                goto LABEL_3d72e8;
            v9 = 9;
LABEL_3d738c:
            sub_3d44fc(a0, v9);
            v2 = &v3;
            v3 = &v2;
            v11 = (unsigned int)sub_3d706c(a0);
            if (!v11 && !(sub_3d706c(a0) * 0x100) || (v2 = &v3, v3 = &v2, v12 = (unsigned int)sub_3d706c(a0), !sub_3d706c(a0) && !(sub_3d706c(a0) * 0x100)))
                goto LABEL_3d72e8;
            v13 = sub_3d706c(a0);
        }
    }
LABEL_3d72ec:
    v14 = a0[13];
    a0[12] = v14;
    return *(unsigned long long *)&v14;
}
