/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d297c..0x9d2a54 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d297c_0 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_9d297c_0 *field_8;
    char padding_10[8];
    struct st_9d297c_0 *field_18;
} st_9d297c_0;

typedef struct st_9d297c_1 {
    long long field_0;
    long long field_4;
    struct st_9d297c_1 *field_8;
    char padding_10[8];
    struct st_9d297c_1 *field_18;
} st_9d297c_1;


int sub_9d297c(st_9d297c_0 **a0)
{
    st_9d297c_1 *v2;  // x0
    st_9d297c_1 *v3;  // x19
    st_9d297c_1 *v4;  // x0
    st_9d297c_1 *v5;  // x0
    st_9d297c_1 *v6;  // x0
    long long v7;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "crypto/bio/bf_buff.c", 47);
    if (v2)
    {
        v3 = v2;
        *(unsigned int *)&v2->field_0 = 0x1000;
        v4 = sub_a6bf4c(0x1000, "crypto/bio/bf_buff.c", 52);
        v3->field_4 = v4;
        if (v4)
        {
            *(unsigned int *)((char *)&v3->field_0 + 4) = 0x1000;
            v5 = sub_a6bf4c(0x1000, "crypto/bio/bf_buff.c", 58);
            *(st_9d297c_1 **)v3->padding_10 = v5;
            if (v5)
            {
                v2 = 1;
                *(unsigned int *)&a0[5] = 1;
                a0[8] = v3;
                *(unsigned int *)&a0[6] = 0;
            }
            else
            {
                sub_a6c2e4(v3->field_4, "crypto/bio/bf_buff.c", 60);
                v6 = v3;
                v7 = 61;
LABEL_9d2a3c:
                sub_a6c2e4(v6, "crypto/bio/bf_buff.c", v7);
                v2 = 0;
            }
        }
        else
        {
            v6 = v3;
            v7 = 54;
            goto LABEL_9d2a3c;
        }
    }
    return (unsigned int)v2;
}
