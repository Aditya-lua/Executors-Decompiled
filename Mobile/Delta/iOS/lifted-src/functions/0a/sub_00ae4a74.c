/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4a74..0xae4a90 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4a74_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_ae4a74_0;

typedef struct st_ae4a74_1 {
    char padding_0[40];
    struct st_ae4a74_0 *field_28;
} st_ae4a74_1;


void sub_ae4a74(st_ae4a74_1 *a0, unsigned long a1)
{
    if (!a1)
    {
        return;
    }
    else if (a0->field_28->field_18)
    {
        goto *((void *)(a0->field_28->field_18));
    }
    else
    {
        return;
    }
}
