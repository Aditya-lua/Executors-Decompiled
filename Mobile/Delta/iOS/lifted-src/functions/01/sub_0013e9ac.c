/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13e9ac..0x13e9e8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13e9ac_0 {
    long long field_0;
    char field_8;
} st_13e9ac_0;


st_13e9ac_0 * sub_13e9ac(st_13e9ac_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8 != 1)
        return a0;
    std::__1::__shared_mutex_base::unlock(a0->field_0);
    return a0;
}
