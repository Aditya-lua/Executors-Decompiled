/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41dc8..0xa41e44 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a41dc8_0 {
    char padding_0[248];
    struct st_a41dc8_1 *field_f8;
} st_a41dc8_0;

typedef struct st_a41dc8_1 {
    unsigned long long field_0;
} st_a41dc8_1;


int sub_a41dc8(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned int v2;  // w0
    st_a41dc8_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50638();
    v3 = sub_9ffdd8(a0);
    if (a3 < v2)
        return 1;
    v3->field_f8();
}
