/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61514..0x61554 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61514_0 {
    unsigned long long field_0;
    long long field_8;
} st_61514_0;


st_61514_0 * sub_61514(st_61514_0 *a0, st_61514_0 *a1)
{
    long long v2;  // x0
    long long count;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    a0->field_0 = a1->field_0;
    if (v2)
    {
        count = std::__1::__shared_weak_count::lock(v2);
        a0->field_8 = count;
        if (count)
            return a0;
    }
    else
    {
        a0->field_8 = 0;
    }
    sub_6179c();
}
