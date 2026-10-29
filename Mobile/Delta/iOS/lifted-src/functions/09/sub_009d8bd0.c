/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8bd0..0x9d8dbc (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8bd0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9d8bd0_0;

typedef struct st_9d8bd0_1 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[12];
    struct st_9d8bd0_2 *field_40;
} st_9d8bd0_1;

typedef struct st_9d8bd0_2 {
    struct st_9d8bd0_0 *field_0;
} st_9d8bd0_2;

extern char g_9d8c3c;
extern char g_d2da6d;

unsigned int sub_9d8bd0(st_9d8bd0_1 *a0, unsigned int a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (132 < a1 - 1)
        return 0;
    goto *((void *)(&(&g_9d8c3c)[4 * *(&(&g_d2da6d)[a1] - 1)]));
}
