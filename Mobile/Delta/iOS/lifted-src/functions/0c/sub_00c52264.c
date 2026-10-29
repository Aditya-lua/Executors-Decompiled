/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc52264..0xc522f0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c52264_0 {
    char padding_0[16];
    struct st_c52264_0 *field_10;
} st_c52264_0;

typedef struct st_c52264_2 {
    struct st_c52264_0 *field_0;
    struct st_c52264_1 *field_8;
    unsigned long long field_10;
} st_c52264_2;

typedef struct st_c52264_1 {
    struct st_c52264_0 *field_0;
    struct st_c52264_0 *field_8;
    struct st_c52264_0 *field_10;
    long long field_18;
    struct st_c52264_0 *field_20;
} st_c52264_1;


st_c52264_0 * sub_c52264(st_c52264_2 *a0)
{
    unsigned long long v2;  // x21
    st_c52264_0 *v3;  // x0
    st_c52264_0 **iter;  // x22
    unsigned long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    v3 = a0;
    if (v3->field_10)
    {
        iter = &a0->field_8->field_10;
        v3 = a0;
        do
        {
            v5 = v2;
            if (*(long long *)((char *)iter - 16))
            {
                v3 = *(long long *)((char *)iter - 8);
                if (v3)
                {
                    if (*iter)
                        v3 = _free();
                    if (iter[2])
                        v3 = _free(iter[1]);
                }
            }
        } while ((iter += 9, v2 = v5 - 1, v5 != 1));
    }
    if (!a0->field_0)
        return v3;
    return _free();
}
