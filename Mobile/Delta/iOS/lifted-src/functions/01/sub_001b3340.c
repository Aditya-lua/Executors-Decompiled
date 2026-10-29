/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b3340..0x1b37c0 (1152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b3340_1 {
    char padding_0[16];
    struct st_1b3340_2 *field_10;
} st_1b3340_1;

typedef struct st_1b3340_3 {
    struct st_1b3340_0 *field_0;
    struct st_1b3340_2 *field_8;
    struct st_1b3340_4 *field_10;
} st_1b3340_3;

typedef struct st_1b3340_4 {
    struct st_1b3340_1 *field_0;
} st_1b3340_4;

typedef struct st_1b3340_2 {
    unsigned long long field_0;
} st_1b3340_2;

typedef struct st_1b3340_0 {
    char field_0;
} st_1b3340_0;

extern char g_10002b0;

void sub_1b3340(st_1b3340_3 *a0, unsigned long a1)
{
    long long v11;  // x0
    long long v12;  // x0
    st_1b3340_0 **v0;  // [bp-0x108], Other Possible Types: char
    st_1b3340_0 *v1;  // [bp-0x100]
    char v2;  // [bp-0xc8]
    unsigned long long *v3;  // [bp-0xb0]
    unsigned long long v4;  // [bp-0x98]
    unsigned long long v5;  // [bp-0x90]
    unsigned long long v6;  // [bp-0x88]
    char v7;  // [bp-0x78]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (*(char *)a0->field_0 == 1)
    {
        *(char *)&a0->field_8->field_0 = 0;
        v4 = 0;
        v5 = 0;
        v6 = 0;
        v3 = &v4;
        sub_1c36d4(&v7, &v3, &v2);
        (*(long long *)(*(long long *)a0->field_10 + 16))();
    }
    if (*(long long *)&g_10002b0 == v8)
        return;
    v11 = __Unwind_Resume(___stack_chk_fail());
    v12 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v11)));
    __Unwind_Resume(v12);
}
