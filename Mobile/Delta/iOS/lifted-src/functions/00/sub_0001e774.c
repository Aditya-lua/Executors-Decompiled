/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e774..0x1e7e8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e774_1 {
    unsigned long long field_0;
} st_1e774_1;

typedef struct st_1e774_0 {
    struct st_1e774_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_1e774_0;

extern st_1e774_0 g_e61f80;

int * sub_1e774(int *a0, int *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == a1)
        return a0;
    (&g_e61f80.field_0)[*a0]();
}
