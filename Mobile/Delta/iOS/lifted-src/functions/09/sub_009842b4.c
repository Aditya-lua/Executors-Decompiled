/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9842b4..0x984308 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9842b4_1 {
    char padding_0[48];
    struct st_9842b4_0 *field_30;
    char padding_38[16];
    struct st_9842b4_1 *field_48;
    struct st_9842b4_1 *field_50;
    char padding_58[16];
    unsigned long long field_68;
} st_9842b4_1;

typedef struct st_9842b4_0 {
    char padding_0[96];
    struct st_9842b4_1 *field_60;
    struct st_9842b4_1 *field_68;
    unsigned long long field_70;
} st_9842b4_0;


st_9842b4_1 * sub_9842b4(st_9842b4_1 *ptr)
{
    unsigned long long v0;  // x8
    st_9842b4_0 *v1;  // x8
    st_9842b4_1 *v2;  // x9

    if (!ptr)
        return ptr;
    v0 = ptr->field_68;
    ptr->field_68 = v0 - 1;
    if (v0 != 1)
        return ptr;
    v1 = ptr->field_30;
    memset(ptr, 0, 24);
    v2 = v1->field_68;
    if (v2)
        v2->field_48 = ptr;
    ptr->field_48 = 0;
    ptr->field_50 = v2;
    v1->field_68 = ptr;
    if (!v1->field_60)
        v1->field_60 = ptr;
    v1->field_70 = v1->field_70 + 1;
    return ptr;
}
