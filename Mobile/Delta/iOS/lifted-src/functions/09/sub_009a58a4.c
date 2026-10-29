/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a58a4..0x9a5950 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a58a4_0 {
    unsigned long long field_0;
    char padding_8[120];
    struct st_9a58a4_0 *field_80;
} st_9a58a4_0;

typedef struct st_9a58a4_1 {
    char padding_0[152];
    struct st_9a58a4_0 *field_98;
    char padding_a0[20];
    struct st_9a58a4_0 *field_b4;
    char padding_bc[2996];
    struct st_9a58a4_0 *field_c70;
    struct st_9a58a4_0 *field_c78;
} st_9a58a4_1;


unsigned long long sub_9a58a4(st_9a58a4_1 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // 4117
    char *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = &v2;
    v3 = sub_a36ae4(20, a2, a3, &v2);
    if (!*(int *)&(a0->padding_a0)[1] || (int)a0->field_98 != 1)
    {
        *(unsigned int *)&(a0->padding_a0)[1] = 1;
        if (*(long long *)&a0->padding_bc[2992] && *(long long *)(*(long long *)&a0->padding_bc[2992] + 128))
            (*(long long *)(*(long long *)&a0->padding_bc[2992] + 128))();
        *(unsigned int *)&a0->field_98 = 1;
        v4 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
        if (!(v4 & 1) && a0->field_c70)
            v3 = sub_957628(a0, 2, a1);
    }
    return v3;
}
