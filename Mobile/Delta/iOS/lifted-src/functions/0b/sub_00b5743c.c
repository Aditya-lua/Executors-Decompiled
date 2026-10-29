/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5743c..0xb57540 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5743c_0 {
    char padding_0[108];
    char field_6c;
} st_b5743c_0;


long long sub_b5743c(st_b5743c_0 *a0, char *a1, char *a2, unsigned long long a3)
{
    unsigned long long i;  // x19
    char *v5;  // x20
    char *v6;  // x21
    unsigned long long j;  // x25
    unsigned long long v8;  // x27
    char v9;  // x28
    unsigned long long v0;  // [bp-0x62]
    char v1;  // [bp-0x61]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    if (!a3)
        return 1;
    i = a3;
    v5 = a2;
    v6 = a1;
    if (a3 >= 0x8000000)
        a3 = 0x8000000;
    do
    {
        if (a3)
        {
            j = 0;
            do
            {
                v8 = j >> 3;
                v9 = (char)j & 7;
                v1 = (v5[v8] >> ((v9 ^ 7) & 31)) * 128;
                sub_9f8f74(&v1, &v0, 1, 1, &a0[1].padding_0[83], &a0->padding_0[32], __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
                v6[v8] = (v0 & 128) >> (v9 & 31) | (char)(-0x81 >> (v9 & 31)) & v6[v8];
                j += 1;
            } while (a3 * 8 != j);
        }
        v5 = &v5[a3];
        v6 = &v6[a3];
        i -= a3;
        if (i < a3)
            a3 = i;
    } while (i);
    return 1;
}
