/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0bd4..0x1f0ccc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0bd4_1 {
    unsigned int *field_0;
    unsigned long long field_8;
} st_1f0bd4_1;

typedef struct st_1f0bd4_0 {
    char field_0;
} st_1f0bd4_0;

extern unsigned long long g_e78e28;
extern unsigned long long g_e78e60;
extern unsigned long long g_e78e68;

void sub_1f0bd4(unsigned long long *a0, st_1f0bd4_1 *a1)
{
    unsigned long long v2;  // x10
    unsigned int *v3;  // x16
    unsigned int *v4;  // x0
    st_1f0bd4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f0bd4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0[1])
    {
        v2 = 0;
        while (!a1->field_8)
        {
            v2 += 1;
            if (v2 == a0[1])
                goto *((void *)(g_e78e60));
        }
        v3 = *a0 + v2 * 8;
        v4 = a1->field_0 + 1;
        if (v3[1] >= (unsigned int)*(int *)((char *)v4 - 4) && *v3 <= *v4)
            goto *((void *)(g_e78e28));
        goto *((void *)(g_e78e68));
    }
    else
    {
        goto *((void *)(g_e78e60));
    }
}
