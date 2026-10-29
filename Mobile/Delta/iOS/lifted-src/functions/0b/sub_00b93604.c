/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb93604..0xb937a0 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b93604_1 {
    unsigned long long field_0;
} st_b93604_1;

typedef struct st_b93604_0 {
    unsigned long long field_0;
    char padding_8[64];
    struct st_b93604_1 *field_48;
    unsigned long long field_50;
} st_b93604_0;

extern char g_b93740;
extern char g_e06325;
extern char g_e06331;

int sub_b93604(st_b93604_0 *a0)
{
    unsigned long long *v2;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_48;
    if (v2 != &v2[8 * a0->field_50])
    {
        goto *((void *)(sub_b93638 + (&g_e06325)[*v2] * 4));
    }
    else if (a0->field_0 != 12)
    {
        goto *((void *)(&(&g_b93740)[4 * (&g_e06331)[a0->field_0]]));
    }
    else
    {
        return 0;
    }
}
