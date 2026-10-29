/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a5d5c..0x2a5dc4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a5d5c_0 {
    void* field_0;
    void* field_8;
    char padding_10[40];
    char field_38;
} st_2a5d5c_0;


void sub_2a5d5c(long long a0, st_2a5d5c_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return;
    sub_2a5d5c(a0, a1->field_0);
    sub_2a5d5c(a0, a1->field_8);
    sub_2a6e94((char *)&a1[1].field_0 + 7, a1->field_38);
}
