/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9623d8..0x962408 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9623d8_0 {
    char padding_0[24];
    struct st_9623d8_0 *field_18;
    unsigned long long field_20;
} st_9623d8_0;

typedef struct st_9623d8_1 {
    char padding_0[984];
    struct st_9623d8_0 *field_3d8;
} st_9623d8_1;


st_9623d8_0 * sub_9623d8(st_9623d8_1 *a0, st_9623d8_0 **a1, st_9623d8_0 **a2)
{
    st_9623d8_0 *v0;  // x8

    v0 = a0->field_3d8;
    *a2 = 0;
    if (!v0)
    {
        return 0;
    }
    else if (v0->field_18)
    {
        *a1 = v0->field_18;
        *a2 = v0->field_20;
        return 1;
    }
    else
    {
        return 0;
    }
}
