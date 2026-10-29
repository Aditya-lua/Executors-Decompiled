/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fcce0..0x9fcd48 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fcce0_2 {
    char padding_0[32];
    struct st_9fcce0_0 *field_20;
} st_9fcce0_2;

typedef struct st_9fcce0_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    struct st_9fcce0_0 *field_20;
} st_9fcce0_1;

typedef struct st_9fcce0_0 {
    char padding_0[112];
    long long field_70;
} st_9fcce0_0;

extern char g_e8d220;

unsigned long long sub_9fcce0(st_9fcce0_1 *a0, st_9fcce0_2 *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a610f8(&a0->field_20->padding_0[8], &a1->field_20->padding_0[8], a0->field_8 != &g_e8d220);
    if (!(unsigned int)v2)
        return v2;
    return !sub_9e5528(a1->field_20->field_70, a0->field_20->field_70);
}
