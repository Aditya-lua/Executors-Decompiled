/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3b2c..0x9d3c1c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3b2c_0 {
    char padding_0[72];
    struct st_9d3b2c_1 *field_48;
} st_9d3b2c_0;

typedef struct st_9d3b2c_1 {
    struct st_9d3b2c_1 *field_0;
    struct st_9d3b2c_0 *field_8;
    char padding_10[24];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[40];
    unsigned int field_58;
} st_9d3b2c_1;


st_9d3b2c_1 * sub_9d3b2c(unsigned long a0, st_9d3b2c_0 *a1)
{
    st_9d3b2c_1 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(128, "crypto/bio/bio_lib.c", 83);
    if (!v2)
        return v2;
    v2->field_0 = a0;
    v2->field_8 = a1;
    v2->field_2c = 1;
    /* unsupported instruction */;
    v2->field_58 = 1;
    if (!sub_a6a660(12, v2, &v2[1].padding_10[4]))
    {
        sub_a6c2e4(v2, "crypto/bio/bio_lib.c", 110);
        return 0;
    }
    else if (a1->field_48)
    {
        a1->field_48();
    }
    else
    {
        v2->field_28 = 1;
        return v2;
    }
}
