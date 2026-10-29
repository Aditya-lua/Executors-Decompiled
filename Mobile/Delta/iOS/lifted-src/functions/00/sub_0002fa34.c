/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2fa34..0x2fb6c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2fa34_1 {
    char padding_0[264];
    unsigned int field_108;
} st_2fa34_1;

typedef struct st_2fa34_0 {
    char field_0;
} st_2fa34_0;

extern char g_10002b0;

unsigned long long sub_2fa34(unsigned long long *a0)
{
    unsigned long long *v7;  // x22
    unsigned long v8;  // x20
    unsigned long long v9;  // x23
    unsigned long long v10;  // x24
    st_2fa34_1 *ptr;  // x0
    st_2fa34_1 *v12;  // x21
    unsigned long v13;  // x8
    unsigned long long v14;  // x0
    long long v15;  // x0
    st_2fa34_0 **v0;  // [bp-0x190], Other Possible Types: char
    st_2fa34_0 *v1;  // [bp-0x188]
    unsigned long v2;  // [bp-0x180]
    unsigned long v3;  // [bp-0x178]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = a0 + 1;
    sub_2d6c4();
    v8 = *v7;
    if (v8)
    {
        v9 = 0;
        v10 = 0;
        do
        {
            if (!(sub_2a4ac(*a0 + v9, v7 + 2) & 1))
            {
                ptr = sub_2a544(&v2, *a0 + v9);
                v12 = *a0 + v9;
                _memcpy(ptr, v12, 261);
                ptr->field_108 = v12->field_108;
                v8 = a0[1];
            }
        } while ((v10 += 1, v9 += 268, v8 > v10));
    }
    v13 = *a0;
    *a0 = v2;
    a0[1] = v3;
    v2 = v13;
    v3 = v8;
    v14 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v14;
    v15 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v15);
}
