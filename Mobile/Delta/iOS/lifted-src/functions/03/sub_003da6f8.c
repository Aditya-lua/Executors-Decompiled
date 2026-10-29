/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da6f8..0x3da75c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3da6f8_0 {
    unsigned long long *field_0;
    char field_8;
    char padding_9[407];
    unsigned long long field_1a0;
} st_3da6f8_0;

extern unsigned long long g_e7f380;
extern char g_e7f3a8;

void sub_3da6f8(st_3da6f8_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_3da6f8_0 *v8;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = (char *)a0 + *(long long *)((char *)a0->field_0 - 24);
    v8->field_0 = &g_e7f380;
    v8->field_1a0 = &g_e7f3a8;
    sub_6549c(&v8->field_8);
}
