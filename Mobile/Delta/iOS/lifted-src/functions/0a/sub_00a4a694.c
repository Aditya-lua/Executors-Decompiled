/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4a694..0xa4a718 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4a694_0 {
    char padding_0[128];
    long long field_80;
} st_a4a694_0;


int sub_a4a694(long long a0, long long a1, long long a2, long long a3)
{
    st_a4a694_0 *v3;  // x0
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9ffdd8();
    v0 = sub_a507d0(a0);
    sub_a97754(a2, a1, a3, v3, a0 + 40, &v0, v3->field_80);
    sub_a50868(a0, v0);
    return 1;
}
