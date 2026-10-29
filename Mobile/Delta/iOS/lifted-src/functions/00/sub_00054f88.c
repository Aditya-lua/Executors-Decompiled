/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54f88..0x55090 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54f88_0 {
    char field_0;
} st_54f88_0;

extern char g_10002b0;

unsigned long long sub_54f88(void* a0)
{
    unsigned long long *v7;  // x20
    unsigned long long v8;  // x9
    void* v9;  // x8
    unsigned long long idx;  // x21
    uint128_t *v11;  // x0
    unsigned long long v12;  // x0
    long long v13;  // x0
    st_54f88_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_54f88_0 *v1;  // [bp-0x68]
    void* v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = a0 + 8;
    sub_17ef4();
    v8 = *v7;
    v9 = *(long long *)a0;
    if (v8)
    {
        idx = 0;
        do
        {
            if (*(long long *)((char *)v9 + 16 * idx) != v7[2])
            {
                v11 = sub_12484(&v2);
                v9 = *(long long *)a0;
                v8 = (long long)a0[8];
                *v11 = *(int128_t *)((char *)v9 + 16 * idx);
            }
        } while ((idx += 1, v8 > idx));
        v9 = *(long long *)a0;
    }
    *(void* *)a0 = v2;
    *(unsigned long long *)&a0[8] = v3;
    v2 = v9;
    v3 = v8;
    v12 = sub_a070(&v2);
    if (*(long long *)&g_10002b0 == v4)
        return v12;
    v13 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v2);
    __Unwind_Resume(v13);
}
