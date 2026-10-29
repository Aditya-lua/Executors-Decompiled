/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7ba70..0xb7bbb4 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7ba70_2 {
    char padding_0[8];
    struct st_b7ba70_0 *field_8;
} st_b7ba70_2;

typedef struct st_b7ba70_0 {
    char padding_0[24];
    struct st_b7ba70_1 *field_18;
} st_b7ba70_0;

typedef struct st_b7ba70_1 {
    unsigned long long field_0;
} st_b7ba70_1;


unsigned long long sub_b7ba70(unsigned long a0, unsigned long long a1, st_b7ba70_2 *a2, unsigned long long a3)
{
    unsigned long long v2;  // x23
    unsigned long long ptr;  // x20
    unsigned long long ptr1;  // x0
    unsigned long long n;  // x23
    unsigned long long i;  // x24
    long long v7;  // x0
    unsigned long v8;  // x23
    long long v9;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 & 1)
    {
        v2 = 0x8000000000000000;
        ptr = "\twhile endlocal assertion failed: assign.prefix -- parallelrepeat\nuntil return";
    }
    else if (a1)
    {
        v2 = a1;
        ptr1 = _malloc(v2);
        if (ptr1)
        {
            ptr = ptr1;
            *(char *)ptr1 = 32;
            n = 1;
            i = v2 >> 1;
            if (i)
            {
                do
                {
                    _memcpy(ptr + n, ptr, n);
                    n *= 2;
                    i >>= 1;
                } while (i);
            }
            if (v2 != n)
                _memcpy(ptr + n, ptr);
        }
        else
        {
            v7 = sub_c6b970(1, v2);
            if (v8 & 0x7fffffffffffffff)
                _free(v9);
            __Unwind_Resume(v7);
        }
    }
    else
    {
        v2 = 0;
        ptr = 1;
    }
    if (a3)
        a2->field_8->field_18();
    if (v2 == 0x8000000000000000 || !v2)
        return 0;
    _free(ptr);
    return 0;
}
