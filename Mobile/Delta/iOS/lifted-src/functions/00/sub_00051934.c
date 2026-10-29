/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51934..0x51a68 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51934_0 {
    char field_0;
} st_51934_0;

extern char g_10002b0;

unsigned long long sub_51934(unsigned long long *a0)
{
    unsigned long long *v7;  // x20
    unsigned long v8;  // x8
    long long v17;  // x0
    unsigned long long v9;  // x21
    unsigned long long v10;  // x22
    unsigned long long *v11;  // x0
    unsigned long long *v12;  // x8
    unsigned long v13;  // x8
    unsigned long v14;  // x9
    unsigned long long v15;  // x0
    long long v16;  // x0
    st_51934_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_51934_0 *v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = a0 + 1;
    sub_bfd0();
    v8 = *v7;
    if (v8)
    {
        v9 = 0;
        v10 = 0;
        do
        {
            if (!(sub_51088(*a0 + v9, v7 + 2) & 1))
            {
                v11 = sub_50ed8(&v2, *a0 + v9);
                v12 = *a0 + v9;
                v13 = v12[1];
                *v11 = *v12;
                v11[1] = v13;
            }
        } while ((v10 += 1, v8 = a0[1], v9 += 16, a0[1] > v10));
    }
    v14 = *a0;
    *a0 = v2;
    a0[1] = v3;
    v2 = v14;
    v3 = v8;
    v15 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v15;
    v16 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    v17 = __Unwind_Resume(v16);
    sub_a070(&v2);
    __Unwind_Resume(v17);
}
