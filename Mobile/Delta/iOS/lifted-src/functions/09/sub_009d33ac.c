/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d33ac..0x9d3434 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d33ac_0 {
    long long field_0;
    struct st_9d33ac_0 *field_8;
} st_9d33ac_0;

typedef struct st_9d33ac_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9d33ac_1 *field_8;
} st_9d33ac_1;


int sub_9d33ac(st_9d33ac_1 **a0)
{
    st_9d33ac_0 *v2;  // x0
    st_9d33ac_0 *v3;  // x20
    st_9d33ac_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(40, "crypto/bio/bf_readbuff.c", 55);
    if (v2)
    {
        v3 = v2;
        *(unsigned int *)&v2->field_0 = 0x1000;
        v4 = sub_a6bffc(0x1000, "crypto/bio/bf_readbuff.c", 60);
        v3->field_8 = v4;
        if (v4)
        {
            v2 = 1;
            *(unsigned int *)&a0[5] = 1;
            a0[8] = v3;
            *(unsigned int *)&a0[6] = 0;
        }
        else
        {
            sub_a6c2e4(v3, "crypto/bio/bf_readbuff.c", 62);
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}
