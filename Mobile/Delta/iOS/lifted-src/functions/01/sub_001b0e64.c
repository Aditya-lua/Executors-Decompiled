/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b0e64..0x1b110c (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b0e64_1 {
    char padding_0[16];
    struct st_1b0e64_2 *field_10;
} st_1b0e64_1;

typedef struct st_1b0e64_3 {
    struct st_1b0e64_0 *field_0;
    struct st_1b0e64_0 *field_8;
    struct st_1b0e64_2 *field_10;
    struct st_1b0e64_4 *field_18;
} st_1b0e64_3;

typedef struct st_1b0e64_4 {
    struct st_1b0e64_1 *field_0;
} st_1b0e64_4;

typedef struct st_1b0e64_2 {
    unsigned long long field_0;
} st_1b0e64_2;

typedef struct st_1b0e64_0 {
    char field_0;
} st_1b0e64_0;

extern char g_10002b0;

int sub_1b0e64(st_1b0e64_3 *a0, unsigned long a1, unsigned long a2)
{
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    st_1b0e64_0 **v0;  // [bp-0xe0], Other Possible Types: char
    st_1b0e64_0 *v1;  // [bp-0xd8]
    char v2;  // [bp-0xa0]
    char *v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    unsigned long v6;  // [bp-0x60]
    char v7;  // [bp-0x58]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (*(char *)a0->field_0 == 1)
    {
        *(char *)a0->field_8 = a2 != 0;
        *(unsigned long *)a0->field_10 = *(long long *)a0->field_10 + a2;
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v3 = &v4;
        sub_1ad984(&v7, &v3, &v2);
        (*(long long *)(*(long long *)a0->field_18 + 16))();
    }
    if (*(long long *)&g_10002b0 == v8)
        return 0;
    v11 = __Unwind_Resume(___stack_chk_fail());
    v12 = __Unwind_Resume(__Unwind_Resume(v11));
    sub_181a8(&v7);
    v13 = __Unwind_Resume(v12);
    __Unwind_Resume(v13);
}
