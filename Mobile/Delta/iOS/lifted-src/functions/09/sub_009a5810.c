/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5810..0x9a58a4 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a5810_0 {
    unsigned long long field_0;
    char padding_8[120];
    struct st_9a5810_0 *field_80;
} st_9a5810_0;

typedef struct st_9a5810_1 {
    char padding_0[152];
    struct st_9a5810_0 *field_98;
    char padding_a0[20];
    struct st_9a5810_0 *field_b4;
    char padding_bc[2996];
    struct st_9a5810_0 *field_c70;
    struct st_9a5810_0 *field_c78;
} st_9a5810_1;


void sub_9a5810(st_9a5810_1 *a0, unsigned int a1)
{
    unsigned long long v2;  // 4117
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(int *)&(a0->padding_a0)[1] && (int)a0->field_98 == 1)
        return;
    *(unsigned int *)&(a0->padding_a0)[1] = 1;
    if (*(long long *)&a0->padding_bc[2992] && *(long long *)(*(long long *)&a0->padding_bc[2992] + 128))
        (*(long long *)(*(long long *)&a0->padding_bc[2992] + 128))();
    *(unsigned int *)&a0->field_98 = 1;
    v2 = arm64g_calculate_condition(1, a1, 1, 0);
    if (v2 & 1)
    {
        return;
    }
    else if (!a0->field_c70)
    {
        return;
    }
}
