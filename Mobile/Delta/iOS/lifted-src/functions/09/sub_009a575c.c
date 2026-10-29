/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a575c..0x9a57a8 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a575c_0 {
    unsigned long long field_0;
    char padding_8[120];
    struct st_9a575c_0 *field_80;
} st_9a575c_0;

typedef struct st_9a575c_1 {
    char padding_0[152];
    struct st_9a575c_0 *field_98;
    char padding_a0[12];
    struct st_9a575c_0 *field_ac;
    unsigned int field_b4;
    char padding_b8[12];
    struct st_9a575c_0 *field_c4;
    char padding_cc[2980];
    struct st_9a575c_0 *field_c70;
} st_9a575c_1;


void sub_9a575c(st_9a575c_1 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)&a0->field_98 = 0;
    *(unsigned int *)&(a0->padding_a0)[1] = 0;
    *(unsigned int *)((char *)&a0->field_ac + 4) = 1;
    if (*(long long *)&a0->padding_cc[2976] && *(long long *)(*(long long *)&a0->padding_cc[2976] + 128))
        (*(long long *)(*(long long *)&a0->padding_cc[2976] + 128))();
    *(unsigned int *)&a0->padding_b8[8] = 0;
    return;
}
