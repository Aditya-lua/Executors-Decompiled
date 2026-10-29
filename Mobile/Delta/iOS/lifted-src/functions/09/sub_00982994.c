/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982994..0x982ad4 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982994_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_982994_0;

typedef struct st_982994_1 {
    char padding_0[8];
    char field_8;
    char field_9;
    char padding_a[19];
    char field_1d;
    char field_1e;
    char padding_1f[25];
    long long field_38;
    long long field_40;
    struct st_982994_0 *field_48;
} st_982994_1;


st_982994_0 * sub_982994(st_982994_1 *a0, st_982994_0 *a1, long long *a2)
{
    st_982994_0 *v6;  // x0
    st_982994_0 *v7;  // x21
    st_982994_0 *v0;  // [bp-0x70]
    st_982994_0 *v1;  // [bp-0x60]
    st_982994_0 *v2;  // [bp-0x50]
    st_982994_0 *v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    v1 = (st_982994_0 *)0;
    v2 = (st_982994_0 *)0;
    v0 = (st_982994_0 *)0;
    v6 = sub_9ebce0();
    if (a1 && v6 && 2 > (char)a0->field_48)
    {
        v7 = v6;
        if (sub_c689b0(&v0, v7) && sub_a6eb5c(&v0, (char)a0->field_48, 1) && sub_a6ebd4(&v0, a0, 8) && (!(char)a0->field_48 || sub_a6ec4c(&v0, &a0->field_9, a0->field_8, 1) && sub_a6ec4c(&v0, &a0->field_1e, a0->field_1d, 1)) && sub_a6ec4c(&v0, a0->field_40, a0->field_38, 1) && sub_c68eb8(&v0, a2) && 169 >= (unsigned long long)*a2 && sub_a6eaf8(&v0))
        {
            _memcpy(a1, v7->field_8, *a2);
            sub_9ebcf4(v7);
            return 1;
        }
        sub_a6ed4c(&v0);
    }
    sub_9ebcf4();
    return 0;
}
