/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991c1c..0x991cc0 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991c1c_2 {
    struct st_991c1c_0 *field_0;
    char padding_8[128];
    struct st_991c1c_1 *field_88;
} st_991c1c_2;

typedef struct st_991c1c_1 {
    char padding_0[8];
    long long field_8;
} st_991c1c_1;

typedef struct st_991c1c_0 {
    char padding_0[2480];
    char field_9b0;
} st_991c1c_0;


char sub_991c1c(st_991c1c_2 *a0)
{
    st_991c1c_1 *v2;  // x22
    char i;  // x0
    unsigned long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_88;
    i = sub_954348(v2->field_8);
    if (i)
    {
        do
        {
            v4 = *(long long *)(i + 8);
            if (a0->field_0->field_9b0 >> 1 & 1)
                sub_a66ec0(*(long long *)(v4 + 24), *(long long *)(v4 + 32));
            sub_a6c2e4(*(long long *)(v4 + 24), "ssl/record/rec_layer_d1.c", 65);
            sub_a6c2e4(*(long long *)(i + 8), "ssl/record/rec_layer_d1.c", 66);
            sub_954264(i);
            i = sub_954348(v2->field_8);
        } while (i);
    }
    *(unsigned long long *)v2->padding_0 = 0;
    return i;
}
