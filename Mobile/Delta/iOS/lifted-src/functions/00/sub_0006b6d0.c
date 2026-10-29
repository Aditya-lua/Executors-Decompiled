/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b6d0..0x6b738 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b6d0_0 {
    char padding_0[1200];
    unsigned long long field_4b0;
} st_6b6d0_0;


void sub_6b6d0(st_6b6d0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_74f58();
    if (!a0->field_4b0)
        return;
    sub_60b20(&a0->padding_0[1192], 1, 5);
    std::__1::condition_variable::notify_one(&a0[1].padding_0[144]);
    std::__1::thread::join(&a0->field_4b0);
    sub_60b20();
    return;
}
