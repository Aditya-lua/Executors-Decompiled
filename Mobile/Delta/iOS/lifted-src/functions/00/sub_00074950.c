/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74950..0x749a8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74950_0 {
    char padding_0[208];
    long long field_d0;
} st_74950_0;


unsigned long long sub_74950(st_74950_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    std::__1::mutex::lock(a0 + 1);
    v2 = sub_66100(a0->field_d0, a1);
    std::__1::mutex::unlock(a0 + 1);
    return v2;
}
