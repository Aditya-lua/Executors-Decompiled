/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967c84..0x967cc0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967c84_2 {
    char padding_0[24];
    struct st_967c84_0 *field_18;
} st_967c84_2;

typedef struct st_967c84_0 {
    char padding_0[48];
    struct st_967c84_1 *field_30;
} st_967c84_0;

typedef struct st_967c84_1 {
    unsigned long long field_0;
} st_967c84_1;


void sub_967c84(st_967c84_2 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_954824())
        return;
    a0->field_18->field_30();
}
