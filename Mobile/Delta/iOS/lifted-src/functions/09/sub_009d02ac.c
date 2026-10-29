/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d02ac..0x9d02f0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d02ac_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_9d02ac_0;

typedef struct st_9d02ac_1 {
    unsigned long long field_0;
} st_9d02ac_1;


void sub_9d02ac(unsigned long a0, st_9d02ac_1 **a1, st_9d02ac_0 *a2)
{
    unsigned long v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)*a1;
    sub_9d524c();
    return;
}
